package view;

import java.util.List;
import javax.swing.table.AbstractTableModel;

import dao.AulaDao;
import dao.MateriaDao;
import model.Aula;
import model.Materia;

public class AulasDoDiaTableModel extends AbstractTableModel{
	List<Aula> aulas;
	List<Materia> materias;
	
	public AulasDoDiaTableModel() {
		aulas = AulaDao.getBy("diasemana", "segunda-feira");
		materias = MateriaDao.getMateriasPeriodo(4);
		//TODO: Pega data atual do computador
	}

	@Override
	public int getColumnCount() {
		return 3;
	}

	@Override
	public int getRowCount() {
		return aulas.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Aula aula = aulas.get(rowIndex);
		switch(columnIndex) {
		case 0:
				return aula.getHoraInicial();
		case 1:
				for(Materia materia : materias){
					if(materia.getIdMateria() == aula.getIdMateria()){
						return materia.getNomeMateria();
					}
				}
		case 2:
			return aula.getLocal();
		default:
			return "";
			
		}
	}
	
}
