    package com.example.JwtAuthentication.Controller;

    import com.example.JwtAuthentication.Model.Product;
    import com.example.JwtAuthentication.Service.Impl.ProductServiceImpl;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.http.HttpStatus;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("/Products")
    public class ProductController {
        @Autowired
        private ProductServiceImpl productService;
        @GetMapping("display")
         public String  display(){

            return "Hey Mama how Are U";
         }

          @PostMapping("/create")
          public  ResponseEntity<Product> createProdcut(@RequestBody Product product){
            return  ResponseEntity.status(HttpStatus.CREATED).body(productService.createProduct(product));
          }

        @GetMapping
        public ResponseEntity<List<Product>> getAllProductss(){
          return   ResponseEntity.ok(productService.getallproducts());
        }
        @GetMapping("/{PdtId}")
        public ResponseEntity<Optional<Product>> getProductByid(@PathVariable int PdtId){
            return  ResponseEntity.ok(productService.getProductById(PdtId));
        }
    }
