package com.company;

import org.graphwalker.core.condition.RequirementCoverage;
import org.graphwalker.core.generator.RandomPath;
import org.graphwalker.core.machine.*;
import org.graphwalker.core.model.Vertex;
import org.graphwalker.java.annotation.GraphWalker;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestBuilder;
import org.graphwalker.java.test.TestExecutor;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;


@GraphWalker(value = "random(vertex_coverage(5))", start = "e_Init")
public class LoginSomeTest extends ExecutionContext implements Login {


    @Override
    public void e_Logout() {
        System.out.println("e_InvalidCredentials: Insert test code here!");
    }

    @Override
    public void v_LoginPrompted() {
        System.out.println("e_InvalidCredentials: Insert test code here!");
    }


    @Override
    public void e_Init() {
        System.out.println("e_InvalidCredentials: Insert test code here!");
    }

    @Override
    public void e_Exit() {
        System.out.println("e_InvalidCredentials: Insert test code here!");
    }

    @Override
    public void e_InvalidCredentials() {

    }

    @Override
    public void v_GmailPageOpened() {

    }

    @Override
    public void e_CleanCache() {

    }

    @Override
    public void e_SearchGmailPage() {

    }

    @Override
    public void v_BrowserNotStarted() {

    }

    @Override
    public void v_SearchResult() {

    }

    @Override
    public void e_ValidCredentials() {

    }

    @Override
    public void v_BrowserOpened() {

    }

        @Override
    public void v_GmailSearchResult() {

    }

       @Override
    public void e_OpenBrowser() {

    }

       @Override
    public void v_EmailOpened() {

    }

       @Override
    public void e_searchEmail() {

    }

        @Override
    public void e_CloseBrowser() {

    }

       @Override
    public void v_LoginMade() {

    }

      @Override
    public void e_ClickOpenGmail() {

    }

         @Override
    public void v_CacheCleaned() {

    }

        @Override
    public void e_ClickToOpen() {

    }

        @Override
    public void e_ClickSignIn() {

    }

    /*
    private Model createModel(){

        Model model = new Model();

        Vertex v_ClientNotRunning = new Vertex().setName("v_ClientNotRunning");
        Vertex v_LoginPrompted = new Vertex().setName("v_LoginPrompted");
        Vertex v_Browser = new Vertex().setName("v_Browser");

        // Create edges
        Edge e_Start = new Edge()
                .setName("e_Init")
                .setTargetVertex(v_ClientNotRunning);
        Edge e_startClient = new Edge()
                .setName("e_StartClient")
                .setSourceVertex(v_ClientNotRunning)
                .setTargetVertex(v_Browser);
        Edge e_LoginSaved = new Edge()
                .setName("e_ToggleRememberMe")
                .setSourceVertex(v_LoginPrompted)
                .setTargetVertex(v_LoginPrompted);
        Edge e_LoginSucceeded = new Edge()
                .setName("e_ValidPremiumCredentials")
                .setSourceVertex(v_LoginPrompted)
                .setTargetVertex(v_Browser);
        Edge e_LoginFailure = new Edge()
                .setName("e_InvalidCredentials")
                .setSourceVertex(v_LoginPrompted)
                .setTargetVertex(v_LoginPrompted);
        Edge e_Logout = new Edge()
                .setName("e_Logout")
                .setSourceVertex(v_Browser)
                .setTargetVertex(v_LoginPrompted);
        Edge e_Close = new Edge()
                .setName("e_Close")
                .setSourceVertex(v_LoginPrompted)
                .setTargetVertex(v_ClientNotRunning);
        Edge e_Exit = new Edge()
                .setName("e_Close")
                .setSourceVertex(v_Browser)
                .setTargetVertex(v_ClientNotRunning);

        // Add vertexes to the model
        model.addVertex(v_ClientNotRunning);
        model.addVertex(v_LoginPrompted);
        model.addVertex(v_Browser);

        // Add edges to the model
        model.addEdge(e_Start);
        model.addEdge(e_startClient);
        model.addEdge(e_LoginSaved);
        model.addEdge(e_LoginSucceeded);
        model.addEdge(e_LoginFailure);
        model.addEdge(e_Logout);
        model.addEdge(e_Close);
        model.addEdge(e_Exit);
        return model;
    }

    @Test
    public void fullCoverageTest() {

        // Create an instance of our model
        Model model = createModel();

        // Build the model (make it immutable) and give it to the execution context
        this.setModel(model.build());

        // Tell GraphWalker to run the model in a random fashion,
        // until every vertex is visited at least once.
        // This is called the stop condition.

        this.setPathGenerator(new RandomPath(new ReachedEdge("e_Init")));

        // Get the starting vertex (v_Start)
        setNextElement(model.getVertices().get(1));

        //Create the machine that will control the execution
        Machine machine = new SimpleMachine(this);

        // As long as the stop condition of the path generator is not fulfilled, hasNext will return true.
        while (machine.hasNextStep()) {

            //Execute the next step of the model.
            machine.getNextStep();
        }
    }
    */
}

