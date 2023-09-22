package seminarsJava001.seminar6.seminar2;
/*Сформируйте SQL-запрос
Инструкция по использованию платформы
Дана строка sql-запроса:

"select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Пример данных для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.

Пример:
{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход
два параметра:

String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами*/

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){

        StringBuilder sb = new StringBuilder();
        sb.append(QUERY);
        PARAMS = PARAMS.replace("{", "").replace("}", "");
        String[] allStr = PARAMS.split(",");

        String name = allStr[0].replace("\"name\"", "").replace(":", "=")
                .replace("\"", "'");
        if (!name.equals("='null'")) {
            sb.append("name");
            sb.append(name);
            //sb.append(" and ");
        }
        String country = allStr[1].replace("\"country\"", "").replace(":", "=")
                .replace("\"", "'").replace(" ", "");
        if (!country.equals("='null'")) {
            if(!name.equals("='null'")) {
                sb.append(" and ");
                sb.append("country");
                sb.append(country);
            } else {
                sb.append("country");
                sb.append(country);
            }
        }
        String city = allStr[2].replace("\"city\"", "").replace(":", "=")
                .replace("\"", "'").replace(" ", "");
        if (!city.equals("='null'")) {
            if(!name.equals("='null'") || !country.equals("='null'")) {
                sb.append(" and ");
                sb.append("city");
                sb.append(city);
            } else {
                sb.append("city");
                sb.append(city);
            }
        }

        String age = allStr[3].replace("\"age\"", "").replace(":", "=")
                .replace("\"", "'").replace(" ", "");
        if (!age.equals("='null'")) {
            if(!name.equals("='null'") || !country.equals("='null'") || !city.equals("='null'")) {
                sb.append(" and ");
                sb.append("age");
                sb.append(age);
            } else {
                sb.append("age");
                sb.append(age);
            }
        }

        return sb;
    }
}
public class taskSQLString1 {
    public static void main(String[] args) {

        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"33\"} ";


        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
