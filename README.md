# vetisapi

Система Меркурий предлагает несколько синхронных сервисов для работы со справочниками и один асинхронный сервис для обработки заявок.

Эта библиотека JAVA классов реализует работу с этими сервисами через Ветис.API

Основной маасив классов сгенерирован утилитой wsdl

Вспомогательные классы помещены в ru.vdsmobile

ru.vsdmobile.samples.RegistryFactory - сборник примеров обращения к синхронным сервисами Ветис.API

ru.vsdmobile.samples.ProfileFactory - пример генерации реквизитов профиля.

Для работы с асинхронным сервисом обработки заявок испольуется класс VetisApplicationService

Вначале надо сформировать объект заявки (Application), затем отправить его в класс VetisApplicationService.
Пример реализации в классе VetDocsRequestTest


Эта библиотека работает в сервисе [https://vsdmobile.ru/vsdm/App.html](https://vsdmobile.ru/vsdm/App.html)

Постепенно опишу более подробно и понятно.

Вопросы, предложения можно либо здесь, либо на страничке проекта в соцсетях:

[https://vk.com/vsdmobile](https://vk.com/vsdmobile)

[https://www.facebook.com/vetismobile](https://www.facebook.com/vetismobile)