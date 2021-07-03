package ch11;

import java.util.Objects;

public class MemberExample {
    public static void main(String[] args) {
        Member member = new Member("blue", "이파란");
        System.out.println(Objects.toString(member));
    }
}
