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
			
			instituicao = new Instituicao("UTFPR", "Campo Mourao");
			instituicaoDao = new InstituicaoDao();
			instituicaoDao.inserirInstituicao(instituicao);
	}
}