# Spring dynamic insert & update

@DynamicInsert and @DynamicUpdate creates JPA queries that only update specific fields and improves performance.

Api:
POST: http://localhost:8080/products

```json
{
  "name": "iPhone 14 Pro Max",
  "price": 1540,
  "description": "Super expensive mobile phone",
  "productType": "mobile"
}
```