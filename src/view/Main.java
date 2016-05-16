package view;

import java.util.Scanner;

import dao.InstituicaoDao;
import model.Instituicao;

public class Main {
	public static Instituicao instituicao;
	public static Scanner scanner;
	public static InstituicaoDao instituicaoDao;
	public static String nomeInstituicao;
	public static String nomeCidade;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Hello");
		do{
			System.out.println("Informe o nome da instituicao:");
			nomeInstituicao = scanner.next();
			
			System.out.println("Informe a cidade:");
			nomeCidade = scanner.next();
			
			instituicao = new Instituicao(nomeInstituicao, nomeCidade);
			instituicaoDao = new InstituicaoDao();
			instituicaoDao.inserirInstituicao(instituicao);
		} while(true);
	}

}
