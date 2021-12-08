package cn.springdemo.greeting;

public class Greeting {
    private String person ;
    // 说话的内容
    private String words ;

    /**
     * 无参构造
     */
    public Greeting() {
    }

    /**
     * 注入person和words
     */
    public Greeting(String person, String words) {
        this.person = person;
        this.words = words;
    }

    /**
     * 定义说话方法。
     */
    public void sayGreeting() {
        System.out.println(person + " 说：“" + words + "”");
    }


}
