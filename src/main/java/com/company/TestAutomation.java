package com.company;

import junit.framework.TestCase;
import org.graphwalker.core.condition.VertexCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.model.Vertex;
import org.graphwalker.java.test.TestBuilder;
import org.junit.experimental.categories.Category;
import org.testng.annotations.Test;
import java.nio.file.Path;
import java.nio.file.Paths;


@Category(LoginSomeTest.class)
public class TestAutomation extends TestCase {

    public final static Path MODEL_PATH = Paths.get("src/main/resources/com/company/Login.graphml");

    @Test
    public void runRequirementCoveragePaths() {
        Vertex start = new Vertex();
        new TestBuilder()
                .addModel(MODEL_PATH, new LoginSomeTest().setNextElement(start)
                        .setPathGenerator(new RandomPath(new VertexCoverage(100)))).execute();
    }
}
