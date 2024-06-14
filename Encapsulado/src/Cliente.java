public class Cliente {
        //ATRIBUTOS
        private String nome;
        private String cpf;
        private String profissao;
        //METODOS GETTERS E SETTERS
        public void setNome(String nome){
        this.nome = nome;
        }

        public String getNome() {
                return nome;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public String getCpf() {
                return cpf;
        }

        public void setProfissao(String profissao) {
                this.profissao = profissao;
        }

        public String getProfissao() {
                return profissao;
        }
}

