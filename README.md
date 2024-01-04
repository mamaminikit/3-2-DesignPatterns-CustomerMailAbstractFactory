# 3-2-DesignPatterns-CustomerMailAbstractFactory
> [!IMPORTANT]
> Group of Creational Design Patterns 🖌️

> [!NOTE]
> Abstract Factory Design Patterns 🏭

- This program works to improve my [CustomerMailFactory](https://github.com/mamaminikit/3-2-DesignPatterns-CustomerMailFactory.git) to be a Abstract Factory Concept.
- However, it works with other design patterns. 
- As follows: Factory Method and Singleton.

> [!TIP]
> **"เอกสารอธิบายโปรแกรม"**
> 
> _Factory Method:_ มีการสร้างClass RegularCustomerFactory, MountainCustomerFactory, and DelinquentCustomerFactory ขึ้นมา เพื่อเป็นตัวแทนของcustomer ในประเภทต่างๆ
> แล้วเรียกใช้Method Getter ของClass ต่างๆ เพื่อสร้างObject ที่ต้องการ โดยไม่ผ่านConstructor
> 
> _Singleton:_ มีการสร้างObject ไว้ล่วงหน้าในแต่ละClass Factory ของประเภทลูกค้า ด้วยวิธีแบบ "**EAGER APPROACH**" 
> และกำหนดPrivate Default Constructor เพื่อให้สามารถสร้างObject ของClass ได้เพียงตัวเดียว
> 
> _Abstract Factory:_ มีการสร้างIContact ไว้ เพื่อเป็นFactory ใหญ่ไว้สร้างFactory อื่นๆ 
> และCustomerFactory เพื่อเรียกใช้Factory ลูกค้าแต่ละประเภท


> Client  ⎯⎯⎯➔  IContact { createMail(), createBrochure() }
> 
> IContact ⎯⎯⎯➔ RegularCustomerFactory { createMail(), createBrochure() }
> IContact ⎯⎯⎯➔ MountainCustomerFactory { createMail(), createBrochure() }
> DelinquentCustomerFactory ⎯⎯⎯➔ RegularCustomerFactory { createMail(), createBrochure() }