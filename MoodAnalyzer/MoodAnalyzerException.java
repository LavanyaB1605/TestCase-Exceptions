package org.example.MoodAnalyzer;

public class MoodAnalyzerException extends Exception {
    public exceptionType type;

    public MoodAnalyzerException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public MoodAnalyzerException(exceptionType type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public MoodAnalyzerException(exceptionType type, String messgae, Throwable cause) {
        super(messgae);
        new MoodAnalyzerException(type, cause);
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD,
        METHOD_INVOCATION_ISSUE, NO_SUCH_FIELD, ILLEGAL_ACCESS
    }
}
