package com.arquitecturajava.ejemplo9;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.arquitecturajava.dominio.Documento;
import com.arquitecturajava.dominio.Versionable;

public class Principal {

	public static void main(String[] args) {

		Documento d1 = new Documento("java", 1);
		Documento d2 = new Documento("net", 2);
		Documento d3 = new Documento("python", 3);
		Documento d4 = new Documento("java", 4);
		List<Documento> lista = Arrays.asList(d1, d2, d3, d4);

		List<Documento> listaNueva = filtrar(lista, Principal::mayorQue, d3);

		listaNueva.stream().map(Documento::getTitulo).forEach(System.out::println);

	}

	public static List<Documento> filtrar(List<Documento> lista, BiPredicate<Documento, Documento> predicado,
			Documento documentoComparar) {

		return lista.stream().filter((docInicial) -> predicado.test(docInicial, documentoComparar))
				.collect(Collectors.toList());

	}

	// bipredicate
	public static boolean mayorQue(Documento inicial, Documento documentoComparar) {

		if (inicial.getVersion() > documentoComparar.getVersion()) {
			return true;
		} else {
			return false;
		}
	}

}
