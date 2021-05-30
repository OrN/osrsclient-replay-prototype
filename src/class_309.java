import java.util.Comparator;

// $FF: renamed from: jr
final class class_309 implements Comparator {

   // $FF: renamed from: j int
   static final int field_3739 = 0;
   // $FF: renamed from: n int
   static final int field_3740 = 2;
   // $FF: renamed from: ef int
   static int field_3741;


   // $FF: renamed from: eo (java.lang.Object) boolean
   public boolean method_5526(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: v (js, js, int) int
   int method_5527(class_310 var1, class_310 var2, int var3) {
      try {
         byte var10000;
         if(-822093809 * var1.field_3744.field_3756 < var2.field_3744.field_3756 * -822093809) {
            if(var3 <= -470211913) {
               throw new IllegalStateException();
            }

            var10000 = -1;
         } else if(var1.field_3744.field_3756 * -822093809 == -822093809 * var2.field_3744.field_3756) {
            if(var3 <= -470211913) {
               throw new IllegalStateException();
            }

            var10000 = 0;
         } else {
            var10000 = 1;
         }

         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "jr.v(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   void method_5528() {
      super();
   }

   public int compare(Object var1, Object var2) {
      try {
         return this.method_5527((class_310)var1, (class_310)var2, 1946951772);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "jr.compare(" + ')');
      }
   }

   // $FF: renamed from: y (java.lang.Object, java.lang.Object) int
   public int method_5529(Object var1, Object var2) {
      return this.method_5527((class_310)var1, (class_310)var2, -225566608);
   }

   // $FF: renamed from: p (java.lang.Object, java.lang.Object) int
   public int method_5530(Object var1, Object var2) {
      return this.method_5527((class_310)var1, (class_310)var2, 1268066605);
   }

   // $FF: renamed from: eg (java.lang.Object) boolean
   public boolean method_5531(Object var1) {
      return super.equals(var1);
   }

   public boolean equals(Object var1) {
      try {
         return super.equals(var1);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "jr.equals(" + ')');
      }
   }

   // $FF: renamed from: fl (java.lang.Object) boolean
   public boolean method_5532(Object var1) {
      return super.equals(var1);
   }

   // $FF: renamed from: n (js, js) int
   int method_5533(class_310 var1, class_310 var2) {
      return -822093809 * var1.field_3744.field_3756 < var2.field_3744.field_3756 * -822093809?-1:(var1.field_3744.field_3756 * -822093809 == -822093809 * var2.field_3744.field_3756?0:1);
   }

   // $FF: renamed from: f (js, js) int
   int method_5534(class_310 var1, class_310 var2) {
      return -822093809 * var1.field_3744.field_3756 < var2.field_3744.field_3756 * -822093809?-1:(var1.field_3744.field_3756 * -822093809 == -822093809 * var2.field_3744.field_3756?0:1);
   }

   // $FF: renamed from: j (js, js) int
   int method_5535(class_310 var1, class_310 var2) {
      return -723128967 * var1.field_3744.field_3756 < var2.field_3744.field_3756 * -822093809?-1:(var1.field_3744.field_3756 * -822093809 == 69578595 * var2.field_3744.field_3756?0:1);
   }
}
