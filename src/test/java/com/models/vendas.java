package com.models;

public class vendas {
        private String id;
        private String idImovel;
        private String idCorretor;
        private String dataVenda;

        public vendas(String id, String idImovel, String idCorretor, String dataVenda) {
            this.id = id;
            this.idImovel = idImovel;
            this.idCorretor = idCorretor;
            this.dataVenda = dataVenda;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIdImovel() {
            return idImovel;
        }

        public void setIdImovel(String idImovel) {
            this.idImovel = idImovel;
        }

        public String getIdCorretor() {
            return idCorretor;
        }

        public void setIdCorretor(String idCorretor) {
            this.idCorretor = idCorretor;
        }

        public String getDataVenda() {
            return dataVenda;
        }

        public void setDataVenda(String dataVenda) {
            this.dataVenda = dataVenda;
        }
}
