import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        List<Library> libraryList = new ArrayList<>();
        libraryList.add(new Library("book1", 100));
        libraryList.add(new Library("book2", 20));
        libraryList.add(new Library("book3", 40));
        libraryList.add(new Library("book4", 30));


        for(Library line : libraryList){
            out.println(line.getName() + ":"
                        + line.getRage());
        }

        libraryList
                .stream()
                .filter(eee->eee.getName().equals("book1"))
                .forEach(ee->out.println(ee.getName() +
                        ":" + ee.getRage()));
        //String name =

        Library library =
        libraryList
                .stream()
                .min(Comparator.comparing
                (Library::getRage)).get();

        String name_min =
                libraryList
                        .stream()
                        .min(Comparator.comparing
                         (Library::getRage))
                        .get()
                        .getName();


        String name_max =
                libraryList
                        .stream()
                        .max(Comparator.comparing
                                (Library::getRage))
                        .get()
                        .getName();

        List<Library> libraryList1=
                libraryList.stream().sorted(
                Comparator.comparing(Library::getRage)
        ).collect(Collectors.toList());

        libraryList1.forEach(ee->out.println(ee.getName() +
                ":"+ ee.getRage()));

        Collections.reverse(libraryList1);
        libraryList1.forEach(ee->out.println(ee.getName() +
                ":"+ ee.getRage()));


        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

              List<String> list1 =   list
                .stream()
                .filter(ee->ee>10)
                .map(eee->String.valueOf(eee))
                .map(ee->ee+"-car")
                .collect(Collectors.toList())
                      ;

              list1.forEach(ee->out.println(ee));


              libraryList1.stream().forEach(ee->{
                  out.println(ee.getName());
                  out.println(ee.getRage());
                  out.println(ee);
              });


    }
}
