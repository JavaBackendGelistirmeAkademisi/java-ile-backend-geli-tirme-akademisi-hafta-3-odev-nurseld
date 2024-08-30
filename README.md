# java-ile-backend-geli-tirme-akademisi-hafta-3-odev-nurseld

# Sosyal Medya Platformu

Bu proje, basit bir sosyal medya platformu simülasyonudur. Java dilinde, farklı veri yapıları ve nesne yönelimli programlama prensipleri kullanılarak geliştirilmiştir. Kullanıcılar birbirini takip edebilir, gönderiler oluşturabilir, yorum yapabilir ve gönderileri favorilerine ekleyebilir.

## Proje Özellikleri

- Kullanıcı Yönetimi: Kullanıcılar oluşturulabilir, birbirlerini takip edebilirler.
- Gönderi Yönetimi: Kullanıcılar gönderi oluşturabilir ve bu gönderilere yorum yapabilirler.
- Takip Sistemi: Kullanıcılar, takip ettikleri kişilerin gönderilerini feed üzerinde görebilirler.
- Favoriler: Kullanıcılar, beğendikleri gönderileri favorilerine ekleyebilir ve favorilerini görüntüleyebilirler.

## Kullanılan Veri Yapıları

- `LinkedHashMap`: Kullanıcı gönderilerini sıralı bir şekilde saklamak için kullanılır.
- `HashSet`: Kullanıcıların takip ettikleri diğer kullanıcıları saklamak için kullanılır.
- `TreeSet`: Kullanıcıların favori gönderilerini sıralı bir şekilde saklamak için kullanılır.

## Sınıflar ve Metodlar

### 1. User Sınıfı

#### Özellikler:
- `name`: Kullanıcının adı.
- `posts`: Kullanıcının gönderilerini saklayan `LinkedHashMap`.
- `following`: Kullanıcının takip ettiği kullanıcıları saklayan `HashSet`.
- `favorites`: Kullanıcının favori gönderilerini saklayan `TreeSet`.

#### Metodlar:
- `follow(User user)`: Kullanıcının başka bir kullanıcıyı takip etmesini sağlar.
- `createPost(String content)`: Kullanıcının yeni bir gönderi oluşturmasını sağlar.
- `addCommentToPost(User user, int postId, String comment)`: Kullanıcının başka bir kullanıcının gönderisine yorum yapmasını sağlar.
- `addToPostFavorites(User user, int postId)`: Kullanıcının başka bir kullanıcının gönderisini favorilerine eklemesini sağlar.
- `showFeed()`: Kullanıcının takip ettiği kullanıcıların gönderilerini gösterir.
- `showFavorites()`: Kullanıcının favorilerine eklediği gönderileri gösterir.
- `showPosts()`: Kullanıcının kendi gönderilerini ve bu gönderilere yapılan yorumları gösterir.

### 2. Post Sınıfı

#### Özellikler:
- `id`: Gönderinin benzersiz kimliği.
- `author`: Gönderiyi oluşturan kullanıcı.
- `content`: Gönderinin içeriği.
- `comments`: Gönderiye yapılan yorumları saklayan `ArrayList`.

#### Metodlar:
- `addComment(Comment comment)`: Gönderiye yorum ekler.
- `getComments()`: Gönderiye yapılan yorumları döner.

### 3. Comment Sınıfı

#### Özellikler:
- `author`: Yorumu yapan kullanıcı.
- `content`: Yorumun içeriği.

## Kullanım

Projenin ana sınıfı `SocialMediaPlatform`'dur. Aşağıdaki adımları izleyerek projeyi çalıştırabilirsiniz:

1. `SocialMediaPlatform` sınıfını çalıştırın.
2. Konsolda aşağıdaki adımların gerçekleştiğini gözlemleyin:
   - Kullanıcılar oluşturulur.
   - Kullanıcılar birbirlerini takip eder.
   - Kullanıcılar gönderiler oluşturur ve yorum yapar.
   - Kullanıcılar gönderileri beğenebilirler.
   - Kullanıcıların feed'leri gösterilir.
   - Kullanıcıların kendi gönderileri ve bu gönderilere yapılan yorumlar gösterilir.

## Test Senaryoları

Ana sınıfta (`SocialMediaPlatform`) aşağıdaki test senaryoları gerçekleştirilir:

- **Kullanıcı Oluşturma:** Üç farklı kullanıcı oluşturulur (`Nursel`, `Almina`, `Belinay`).
- **Takip Etme:** Kullanıcılar birbirini takip eder.
- **Gönderi Oluşturma:** Kullanıcılar gönderi oluşturur.
- **Yorum Yapma:** Kullanıcılar diğer kullanıcıların gönderilerine yorum yapar.
- **Beğenme:** Kullanıcılar gönderileri beğenirler.
- **Feed Gösterimi:** Kullanıcıların takip ettikleri kişilerin gönderileri feed üzerinde gösterilir.
- **Kullanıcı Gönderileri Gösterimi:** Her kullanıcının kendi gönderileri ve bu gönderilere yapılan yorumlar gösterilir.

## Projeyi Çalıştırma

Projeyi çalıştırmak için:

1. `SocialMediaPlatform` sınıfını derleyin.
2. Ana metodu (`main`) çalıştırın.
3. Konsolda tüm adımların gerçekleştiğini gözlemleyin.

