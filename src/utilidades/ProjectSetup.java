package utilidades;

public class ProjectSetup {
	//arquivo xml contendo informações sobre todas as imagens da base
	public static final String databaseXMLPath = "textDescDafitiPosthaus.xml";
	
	//arquivo txt gerado ao converter o xml da base
	public static final String databaseTxtPath = "DafitiPosthausText.txt";
	
	//base de imagens para ser usada pelo indexador
	public static final String databasePath = "colecaoDafitiPhostaus";

	//diretorio onde se encontram as imagens de consulta
	public static final String consultasPath = "Consultas_Relevantes_DafitiPosthaus/imgsConsulta/colecaoAvulso_semParticao";
	
	//diretório onde se encontram as relações de imagens relevantes para as consultas 
	public static final String relevantesPath = "Relevantes/avulso";
	public static final String relevantesXMLPath = "Consultas_Relevantes_DafitiPosthaus/relevantes/Avulso";
	public static final String ranksConsultasPath = "consultasAvaliadas/colecaoAvulso_semParticao";
	public static final String ranksBasePath = "consultas";
}
