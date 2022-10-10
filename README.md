# spring-boot-graphql

## Nedir Bu GraphQL?

GraphQL API'ler için bir sorgulama dilidir/syntaxtır. 
Belirli bir veritabanına ya da depolama yapısına bağlı değildir. 
Bunun yerine mevcut geliştirmeleriniz ve verileriniz tarafından desteklenerek veri 
sorgulamak ya da veriler üzerinde işlem yapmak için kullanılan açık kaynaklı rest tabanlı bir web servis sorgulama dilidir. 
Facebook tarafından 2012 yılında geliştirilmiş, 2015 yılında açık kaynaklı olarak duyurulmuştur.

![alt text](https://media.crystallize.com/crystallize_marketing/20/9/3/2/developer_comics_rest_vs_graphql_part_2.jpg)

## Avantajları & Dezavantajları
###### Avantajları:
* Verilerin kontrolü client tarafındadır. Client ihtiyaç duyduğu verileri belirtir. Bu sayede backend tarafından eksik ya da fazla veri gelme durumu önlenmiş olur.
* GraphQL de tek bir url'e istek atıldığı için ve istek sorgu ile belirlendiği için backend tarafında yapılan herhangi bir versiyonlama client tarafını etkilemez.
* Bir veri için birden çok api'ye istek atmaya gerek kalmaz. Bu sebeple ağ yoğunluğu daha az olur.
* Veri kontrolü client tarafında olduğu response tipleri client tarafından bilinir.
* Backend tarafında yapılan geliştirmelerin dokümanı otomatik olarak oluşturulur.

###### Dezavantajları:
* Tüm istekler POST olduğu için ve yapılan istekler tek bir url'e olduğu için url bazlı cache işlemleri için efor artabilir.
* Atılan isteğin karmaşıklığını client tarafından gelen sorgu belirliyor. Sorgunun karmaşıklığının artması performans kaybına sebep olabilir.
* Rest tabanlı uygulamalarda statü koduna göre gelen hata yorumlanabilirken GraphQL tarafında dönen her istek 200 statü kodlu olarak dönmektedir.

###### -------------------------------
Yazının tamamı: https://medium.com/@aknncam/nedir-bu-graphql-beb6309a2c70
###### -------------------------------
