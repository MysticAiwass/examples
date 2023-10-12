package SteudentMenedmentSystem;

public class Student {
    private String name;
    private Double finalMark;
    public Student (String name){
        this.name = name;
        this.finalMark = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Double finalMark) {
        this.finalMark = finalMark;
    }

}
