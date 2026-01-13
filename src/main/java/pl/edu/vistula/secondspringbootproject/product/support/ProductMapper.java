package pl.edu.vistula.secondspringbootproject.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.secondspringbootproject.product.api.request.ProductRequest;
import pl.edu.vistula.secondspringbootproject.product.api.request.UpdateProductRequest;
import pl.edu.vistula.secondspringbootproject.product.api.response.ProductResponse;
import pl.edu.vistula.secondspringbootproject.product.domain.Product;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        return product;
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setName(updateProductRequest.getName());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getName());
    }
}
