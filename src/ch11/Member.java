package ch11;
//11-4
public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + ": " + name;
    }
    //코드작성
}
