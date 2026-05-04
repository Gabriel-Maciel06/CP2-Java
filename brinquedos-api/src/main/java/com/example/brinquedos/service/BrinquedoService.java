package com.example.brinquedos.service;

import com.example.brinquedos.dto.BrinquedoRequestDTO;
import com.example.brinquedos.dto.BrinquedoResponseDTO;
import com.example.brinquedos.model.Brinquedo;
import com.example.brinquedos.repository.BrinquedoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BrinquedoService {

    @Autowired
    private BrinquedoRepository repository;

    public List<BrinquedoResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(BrinquedoResponseDTO::new)
                .collect(Collectors.toList());
    }

    public BrinquedoResponseDTO buscarPorId(Long id) {
        Brinquedo brinquedo = repository.findById(id).orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
        return new BrinquedoResponseDTO(brinquedo);
    }

    public BrinquedoResponseDTO salvar(BrinquedoRequestDTO dto) {
        Brinquedo brinquedo = new Brinquedo();
        brinquedo.setNome(dto.getNome());
        brinquedo.setTipo(dto.getTipo());
        brinquedo.setClassificacao(dto.getClassificacao());
        brinquedo.setTamanho(dto.getTamanho());
        brinquedo.setPreco(dto.getPreco());
        
        brinquedo = repository.save(brinquedo);
        return new BrinquedoResponseDTO(brinquedo);
    }

    public BrinquedoResponseDTO atualizar(Long id, BrinquedoRequestDTO dto) {
        Brinquedo brinquedo = repository.findById(id).orElseThrow(() -> new RuntimeException("Brinquedo não encontrado"));
        
        brinquedo.setNome(dto.getNome());
        brinquedo.setTipo(dto.getTipo());
        brinquedo.setClassificacao(dto.getClassificacao());
        brinquedo.setTamanho(dto.getTamanho());
        brinquedo.setPreco(dto.getPreco());
        
        brinquedo = repository.save(brinquedo);
        return new BrinquedoResponseDTO(brinquedo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
