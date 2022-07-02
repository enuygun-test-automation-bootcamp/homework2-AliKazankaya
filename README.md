# homework2

## Unit Test Nedir ?

* Unit Test(Birim Testi), bir yazılımın ayrı birimlerinin veya bileşenlerinin test edildiği bir yazılım testi türüdür. Amaç, yazılım kodunun her biriminin beklendiği gibi çalıştığını doğrulamaktır.

* Birim testi, genellikle geliştirici tarafından gerçekleştirilen bir WhiteBox test tekniğidir. Gerçek dünyada, geliştiricilerin testlere isteksizliği veya zaman sıkıntısı nedeniyle, QA mühendisleri aynı zamanda birim testleri(unit test) de yapar.

* JUnit ise java tabanlı kodların test edilmesi için kullanılan bir Unit Test – Birim Testi kütüphanesidir. JUnit gibi araçlar test işlemlerini kolaylaştırır ve çeşitli ek özellikler sunarak bu süreyi kısaltır.


JUnit5 ile yapılan test işlemleri için Assertions sınıfında yer alan overload edilmiş statik assert metotları kullanılır.

Bazı assert metotları şunlardır;

* assertEquals
* assertNotEquals
* assertArrayEquals
* assertIterableEquals
* assertNull
* assertNotNull
* assertLinesMatch
* assertNotSame
* assertSame
* assertTimeout
* assertTimeoutPreemptively
* assertTrue
* assertFalse
* assertThrows
* *fail