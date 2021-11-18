package br.com.finder.bakery.material;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MaterialServiceTest {

    @InjectMocks
    private MaterialService materialService;


    @Test
    void given_NameThatAlreadExists_ShouldThrowsException(){
        Material material = Material.builder()
                .id(1L)
                .name("Test")
                .quantity(10)
                .user("Fulano")
                .build();

        assertThrows(Exception.class, () -> materialService.create(material));
    }
}
