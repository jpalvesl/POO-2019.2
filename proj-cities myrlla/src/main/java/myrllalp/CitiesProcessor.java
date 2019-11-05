package myrllalp;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CitiesProcessor {
    Set<City> citiesSet = new TreeSet<>();


    public Set<City> getCitiesSet() {
        return citiesSet;
    }

    public void setCitiesSet(Set<City> citiesSet) {
        this.citiesSet = citiesSet;
    }

    public Set<City> buildSetOfCities(Path file){
        Set<City> setCityAux = new TreeSet<>();
        try {
            FileReader fr = new FileReader(String.valueOf(file));
            BufferedReader br = new BufferedReader(fr);
            String linha = null;
            while ((linha=br.readLine())!=null){
                String lista[] = linha.split(",");
                String cidade = lista[0];
                String estado = lista[1];
                String zipCode = lista[2];
                City c1 = new City(cidade,estado,zipCode);
                setCityAux.add(c1);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return setCityAux;

    }

    public void writeSetOfCities(Path fileDestino, Comparator<City> comparator ){
        Set<City> ordenado = new TreeSet<>(comparator);
        ordenado.addAll(getCitiesSet());
//            File file = new File(String.valueOf(fileDestino));
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
            ordenado.forEach(c->{
                try {
                    Files.write(
                            fileDestino,
                            Collections.singleton(c.toString()),
                            Charset.defaultCharset(),
                            StandardOpenOption.CREATE,
                            StandardOpenOption.APPEND,
                            StandardOpenOption.WRITE);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });


    }

    public void printaSet() {
        this.getCitiesSet().forEach(city -> {
            System.out.println(city.getNome() + ", " + city.getSigla() + ", " + city.getZipCode());
        });
    }

    public void testarEscrita(Path destino, Comparator<City> comparator){
        Set <City> aux = new TreeSet<>(comparator);
        aux.addAll(getCitiesSet());
        String destino1 = String.valueOf(destino);
        File file = new File(destino1);
        try {

        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);

        for (City c : aux){
            bw.write(c.getNome());
        }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }


}
