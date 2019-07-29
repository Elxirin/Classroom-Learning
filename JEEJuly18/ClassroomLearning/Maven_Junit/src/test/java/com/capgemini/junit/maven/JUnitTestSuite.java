package com.capgemini.junit.maven;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
	JUnitTest_Add.class,
	JUnitTest_Sub.class
})

public class JUnitTestSuite
{
}