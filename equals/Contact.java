package equals;

import java.util.Objects;

public class Contact {
    int id;
    String name;
    String phone;

    public Contact(int id, String name, String phone){
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String toString(){
        return "Contact{" + "id= " + id + ", name= " + name + ", phone= " + phone + "}";
    }

    @Override
    public boolean equals(Object o){ //  метод, который сравнивает наш контакт с другим объектом o.
        if (this == o){
            return true; // если обьект является тем же самымм объектом, то есть ссылки обоих обьектов равны то метод выдаст TRUE
        }
        if (!(o instanceof Contact)){
            return false; // проверяем, если объект o не является Contact, то они не равны, и мы возвращаем false.
        }

        Contact contact = (Contact) o; // через явное приведением типов говорим что о - Контакт!
        if (id != contact.id){
            return false;  // если id у них не совпадает, возвращаем false.
        }
        if (!Objects.equals(name, contact.name)){
            return false; // если name не совпадает, возвращаем false.
        }

        return Objects.equals(phone, contact.phone);
    }

    @Override
    public int hashCode() {
        int result = id;
        //result = 31 * result + (name != null ? name.hashCode() : 0); // тернарные операторы выполняют то же что и нише, но непонятно
        // result = 31 * result + (phone != null ? phone.hashCode() : 0);
        if (name != null ){
            result = 31 * result + name.hashCode();
        } else {
            result = 31 * result;
        }

        if (phone != null){
            result = 31 * result + phone.hashCode();
        } else {
            result = 31 * result;
        }
        return result;
    }
}
