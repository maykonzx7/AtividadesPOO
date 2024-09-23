public class Pc {

    public static void main(String[] args) {
        Computador meuComputador = new Computador(512, 16, 650, "Ryzen 5 5500", "RTX 2060 Super", "B450", "Windows 10", true);

        meuComputador.exibirEspecificacoes();

        meuComputador.atualizarSistemaOperacional("Windows 11");

        meuComputador.aumentarMemoriaRam(16);

        meuComputador.trocarProcessador("Ryzen 5 5600G");

        meuComputador.ligarComputador();
    }

    public static class Computador {

        private int armazenamento;
        private int memoriaRam;
        private int fonte;
        private String processador;
        private String placaDeVideo;
        private String placaMae;
        private String sistemaOperacional;
        private boolean tamanhoTela;

        public Computador(int armazenamento, int memoriaRam, int fonte, String processador, String placaDeVideo, String placaMae, String sistemaOperacional, boolean tamanhoTela) {
            this.armazenamento = armazenamento;
            this.memoriaRam = memoriaRam;
            this.fonte = fonte;
            this.processador = processador;
            this.placaDeVideo = placaDeVideo;
            this.placaMae = placaMae;
            this.sistemaOperacional = sistemaOperacional;
            this.tamanhoTela = tamanhoTela;
        }

        public Computador(int armazenamento, int memoriaRam, String processador, String sistemaOperacional) {
            this.armazenamento = armazenamento;
            this.memoriaRam = memoriaRam;
            this.processador = processador;
            this.sistemaOperacional = sistemaOperacional;
            this.fonte = 500;
            this.placaDeVideo = "Integrada";
            this.placaMae = "Genérica";
            this.tamanhoTela = false;
        }

        public Computador() {
            this.armazenamento = 512;
            this.memoriaRam = 16;
            this.fonte = 650;
            this.processador = "Ryzen 5 4600G";
            this.placaDeVideo = "RX 6600";
            this.placaMae = "A320M-DA";
            this.sistemaOperacional = "Windows 11";
            this.tamanhoTela = true;
        }

        public int getArmazenamento() {
            return armazenamento;
        }

        public void setArmazenamento(int armazenamento) {
            this.armazenamento = armazenamento;
        }

        public int getMemoriaRam() {
            return memoriaRam;
        }

        public void setMemoriaRam(int memoriaRam) {
            this.memoriaRam = memoriaRam;
        }

        public int getFonte() {
            return fonte;
        }

        public void setFonte(int fonte) {
            this.fonte = fonte;
        }

        public String getProcessador() {
            return processador;
        }

        public void setProcessador(String processador) {
            this.processador = processador;
        }

        public String getPlacaDeVideo() {
            return placaDeVideo;
        }

        public void setPlacaDeVideo(String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
        }

        public String getPlacaMae() {
            return placaMae;
        }

        public void setPlacaMae(String placaMae) {
            this.placaMae = placaMae;
        }

        public String getSistemaOperacional() {
            return sistemaOperacional;
        }

        public void setSistemaOperacional(String sistemaOperacional) {
            this.sistemaOperacional = sistemaOperacional;
        }

        public boolean isTamanhoTela() {
            return tamanhoTela;
        }

        public void setTamanhoTela(boolean tamanhoTela) {
            this.tamanhoTela = tamanhoTela;
        }

        public void exibirEspecificacoes() {
            System.out.println("Especificações do Computador:");
            System.out.println("Armazenamento: " + armazenamento + " GB");
            System.out.println("Memória RAM: " + memoriaRam + " GB");
            System.out.println("Fonte: " + fonte + " Watts");
            System.out.println("Processador: " + processador);
            System.out.println("Placa de Vídeo: " + placaDeVideo);
            System.out.println("Placa Mãe: " + placaMae);
            System.out.println("Sistema Operacional: " + sistemaOperacional);
            System.out.println("Tamanho de Tela: " + (tamanhoTela ? "Grande" : "Pequeno"));
        }

        public void atualizarSistemaOperacional(String novoSO) {
            this.sistemaOperacional = novoSO;
            System.out.println("Sistema operacional atualizado para: " + novoSO);
        }

        public void aumentarMemoriaRam(int quantidade) {
            this.memoriaRam += quantidade;
            System.out.println("Memória RAM aumentada para: " + this.memoriaRam + " GB");
        }

        public void trocarProcessador(String novoProcessador) {
            this.processador = novoProcessador;
            System.out.println("Processador trocado para: " + novoProcessador);
        }

        public void ligarComputador() {
            System.out.println("Ligando a máquina...");
        }
    }
}
