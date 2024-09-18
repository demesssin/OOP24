package Packet1;

public class Person {
    public String name;

    /*
    Если бы мы тут использовали default модификатор:
    String name;
    То мы бы не смогли получить к нему доступ так как он распостраняется лишь на ОДИН пакет
    То есть я его не могу вызвать в классе Test из пакета src
     */
}
