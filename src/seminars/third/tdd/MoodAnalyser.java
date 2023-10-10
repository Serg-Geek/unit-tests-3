package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String str) {
        if (str.contains("хорошее"))
            return "happy";
        if (str.contains("плох"))
            return "sad";

        return "so so";
    }

}