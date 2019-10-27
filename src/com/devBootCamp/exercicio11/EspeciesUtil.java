package com.devBootCamp.exercicio11;

import java.util.List;

public interface EspeciesUtil {

	List<Animal> filtraEspecie(List<Animal> animais, EspecieAnimal especieFiltrar);

	List<EspecieAnimal> classificaEspecies(List<Animal> animais);
}
