package model.bean;

public class ContractDetail {
    private int contractDetailId;
    private int contractId;
    private int attachServiceId;
    private int quantityId;

    public ContractDetail() {
    }

    public ContractDetail(int contractId, int attachServiceId, int quantityId) {
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantityId = quantityId;
    }

    public ContractDetail(int contractDetailId, int contractId, int attachServiceId, int quantityId) {
        this.contractDetailId = contractDetailId;
        this.contractId = contractId;
        this.attachServiceId = attachServiceId;
        this.quantityId = quantityId;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public int getQuantityId() {
        return quantityId;
    }

    public void setQuantityId(int quantityId) {
        this.quantityId = quantityId;
    }
}
