public class LogLevels {

    public static String message(String logLine) {
        String[] s = logLine.split("(.*)(:\\s*)");
        return s[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] s = logLine.split("([\\[\\]])");
        return s[1].toLowerCase().trim();
    }

    public static String reformat(String logLine) {
        String firstPart = LogLevels.message(logLine);
        String secondPart = LogLevels.logLevel(logLine);
        String formattedString = firstPart + " (" + secondPart + ")";
        return formattedString;
    }
}
