package helper;

import org.apache.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Arrays;

    public class TestListener implements ITestListener {
        private Logger log = Logger.getLogger(this.getClass());

        @Override
        public void onTestStart(ITestResult result) {
            log.info(getLogText("started", result));
        }

        @Override
        public void onTestSuccess(ITestResult result) {
            log.info(getLogText("passed", result));
        }

        @Override
        public void onTestFailure(ITestResult result) {
            log.info(getLogText("failed", result));
        }

        @Override
        public void onTestSkipped(ITestResult result) {
            log.info(getLogText("skipped", result));
        }

        private String getLogText(String status, ITestResult result) {
            String format = "Test %s: %s with parameters %s";
            return String.format(format, status, result.getName(), Arrays.toString(result.getParameters()));
        }
    }
