package hu.pnt.gtd.cucumber.stepdefs;

import hu.pnt.gtd.GtdApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GtdApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
