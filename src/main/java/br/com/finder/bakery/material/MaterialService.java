package br.com.finder.bakery.material;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Getter
@Setter
@Service
@Component
public class MaterialService  {
    private MaterialRepository materialRepository;

    @Autowired(required = false)public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public List<Material> listByName(String name){
        return materialRepository.findByName(name);
    }

    public List<Material> listByUser(String user){
        return  materialRepository.findByUser(user);
    }

    public Material create(Material material) throws Exception {
        if(materialRepository.existsByName(material.getName())){
            throw new Exception("This material already exists");
        }
        return materialRepository.save(material);
    }

    public Material update(Material material){
        return  materialRepository.save(material);
    }

    public void delete(Long id){
        materialRepository.deleteById(id);
    }

    public boolean existsByName(Material material){
        return materialRepository.existsByName(material.getName());
    }
}
