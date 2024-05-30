Springboot的spring-boot-starter-test，包含了许多单元测试的框架，如junit、mockito、hamcrest，一个依赖就满足所有的单元测试需求

springboot的依赖管理可以继承parent、或者直接依赖dependencies
- spring-boot-dependencies 定义好了所有的依赖版本
- spring-boot-starter-parent 在上面的基础上又增加了一些插件的版本


mockito
@ExtendWith(MockitoExtension.class) 必须加的
@MockBean，模拟一个没有完成的bean，用when().thenReturn()模拟其逻辑
@InjectMocks, 加载被测试对象上，被测试对象的依赖对象会被替换成MockBean