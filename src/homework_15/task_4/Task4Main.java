package homework_15.task_4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;

/*Распарсить 5 страниц сайта kinogo.by. Какой парсер использовать - ваш выбор, погуглите разные варианты
Получите данные о фильме и поместите их в свой класс. Если какого-то поля у фильма не будет, то пускай оно будет null

Пример полей класса Film

Год выпуска: 2019
Страна: США
Жанр: Фантастика
Качество: HDRip
Перевод: Профессиональный (многоголосый)
Продолжительность: 60 мин. / 01:00
Премьера: 12 ноября 2019*/
public class Task4Main {
    public static void main(String[] args) {
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        ClassLoader.getSystemResource("kinogo.by");



    }
}
