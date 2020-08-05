package top.abosen.example.base;

/**
 * @author qiubaisen
 * @date 2020/8/5
 */
class Application {
    public static void main(String[] args) {
        Person person = new Person("张三", 20);
        System.out.println(PersonKt.getBirthYear(person));
    }
}
