package br.com.finder.bakery.material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rawMaterials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping("{name}")
    public ResponseEntity<List<Material>> listByName(@PathVariable String name) {
        return ResponseEntity.ok(materialService.listByName(name));
    }

    @GetMapping("{user}")
    public ResponseEntity<List<Material>> listByUser(@PathVariable String user) {
        return ResponseEntity.ok(materialService.listByUser(user));
    }

    @PostMapping
    public ResponseEntity<Material> create(@RequestBody Material material) throws Exception {
        return ResponseEntity.ok(materialService.create(material));
    }

    @PutMapping("{id}")
    public ResponseEntity<Material> update(@RequestBody Material material){
        return  ResponseEntity.ok(materialService.update(material));
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable Long id){
        materialService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
