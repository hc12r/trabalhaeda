public interface DisciplinaManager {
    public boolean criarDisciplina(String nomeDisciplina, int semestre, int tipo, String curso);
    public boolean inserirNoPlano(String nomeDisciplina, String nomePlano);
    public boolean inserirDisciplina(int ID, int semestre, int tipo, String curso, String disciplina);
    public boolean removerDisciplinaPlano(String curso, String disciplina);
    public boolean pesquisaDisciplina(String disciplina);
    public boolean pesquisaPlano(String curso);
    public boolean pesquisarDisciplinaPorTopico(String topico);
}
