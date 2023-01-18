package Exercism;
public class LogLevels {
    
    public static String message(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        String[] inputMessage = logLine.split(":");
        return inputMessage[1].trim();
    }

    public static String logLevel(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");
         String[] inputMessage = logLine.split(":");
        String logLevel = inputMessage[0].replace("[","").replace("]","").toLowerCase();
        return logLevel;
    }

    public static String reformat(String logLine) {
        //throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
       // String[] inputMessage = logLine.split(":");
        String logLevel = LogLevels.logLevel(logLine);
        String Message = LogLevels.message(logLine);
        String output = Message+" ("+logLevel+")";
        return output;
    }
}