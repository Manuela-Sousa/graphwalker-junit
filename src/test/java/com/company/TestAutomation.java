package com.company;


import org.graphwalker.core.condition.EdgeCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.Context;
import org.graphwalker.core.model.Edge;
import org.graphwalker.core.model.Vertex;
import org.graphwalker.io.factory.yed.YEdContextFactory;
import org.graphwalker.java.test.Executor;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestBuilder;
import org.graphwalker.java.test.TestExecutor;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class TestAutomation {

  public final static Path MODEL_PATH = Paths.get("src/main/resources/com/company/Login.graphml");

  @Test
  public void testExecutor() throws IOException {
    Executor executor = new TestExecutor(LoginSomeTest.class);
    Result result = executor.execute(true);
    if (result.hasErrors()) {
      for (String error : result.getErrors()) {
        System.out.println(error);
      }
    }
    System.out.println("Done: [" + result.getResults().toString(2) + "]");
  }

  @Test
  public void testBuilder() throws IOException {
    Edge start= new Edge().setName("e_Init");
    List<Context> contexts = new YEdContextFactory().create(MODEL_PATH);
    Assert.assertThat("Only 1 model should have been found, thus only 1 context", contexts.size(), is(1));
    contexts.get(0).setPathGenerator(new RandomPath(new EdgeCoverage(100)));

    Executor executor = new TestExecutor(contexts);
    Result result = executor.execute(true);
    if (result.hasErrors()) {
      for (String error : result.getErrors()) {
        System.out.println(error);
      }
    }
    System.out.println("Done: [" + result.getResults().toString(2) + "]");
  }
}
