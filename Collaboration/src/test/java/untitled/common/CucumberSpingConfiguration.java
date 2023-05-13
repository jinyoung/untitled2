package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CollaborationApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CollaborationApplication.class })
public class CucumberSpingConfiguration {}
