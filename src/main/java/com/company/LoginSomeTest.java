package com.company;


import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.GraphWalker;

@GraphWalker(value = "random(edge_coverage(100))", start = "e_Init")
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
}

