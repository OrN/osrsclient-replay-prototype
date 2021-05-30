import java.util.Iterator;

// $FF: renamed from: kg
public class class_321 implements Iterator {

   // $FF: renamed from: f mf
   class_59 field_3806;
   // $FF: renamed from: n mf
   class_59 field_3807;
   // $FF: renamed from: v ko
   class_328 field_3808;


   // $FF: renamed from: s () java.lang.Object
   public Object method_5678() {
      class_59 var1 = this.field_3807;
      if(var1 == this.field_3808.field_3849) {
         var1 = null;
         this.field_3807 = null;
      } else {
         this.field_3807 = var1.field_469;
      }

      this.field_3806 = var1;
      return var1;
   }

   // $FF: renamed from: u () java.lang.Object
   public Object method_5679() {
      class_59 var1 = this.field_3807;
      if(var1 == this.field_3808.field_3849) {
         var1 = null;
         this.field_3807 = null;
      } else {
         this.field_3807 = var1.field_469;
      }

      this.field_3806 = var1;
      return var1;
   }

   // $FF: renamed from: a () void
   public void method_5680() {
      if(this.field_3806 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3806.method_635();
         this.field_3806 = null;
      }
   }

   public void remove() {
      if(this.field_3806 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3806.method_635();
         this.field_3806 = null;
      }
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_5681() {
      class_59 var1 = this.field_3807;
      if(var1 == this.field_3808.field_3849) {
         var1 = null;
         this.field_3807 = null;
      } else {
         this.field_3807 = var1.field_469;
      }

      this.field_3806 = var1;
      return var1;
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_5682() {
      class_59 var1 = this.field_3807;
      if(var1 == this.field_3808.field_3849) {
         var1 = null;
         this.field_3807 = null;
      } else {
         this.field_3807 = var1.field_469;
      }

      this.field_3806 = var1;
      return var1;
   }

   // $FF: renamed from: e () void
   public void method_5683() {
      if(this.field_3806 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3806.method_635();
         this.field_3806 = null;
      }
   }

   // $FF: renamed from: c () boolean
   public boolean method_5684() {
      return this.field_3807 != this.field_3808.field_3849;
   }

   // $FF: renamed from: l () boolean
   public boolean method_5685() {
      return this.field_3807 != this.field_3808.field_3849;
   }

   // $FF: renamed from: o () boolean
   public boolean method_5686() {
      return this.field_3807 != this.field_3808.field_3849;
   }

   public boolean hasNext() {
      return this.field_3807 != this.field_3808.field_3849;
   }

   // $FF: renamed from: g () void
   public void method_5687() {
      if(this.field_3806 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3806.method_635();
         this.field_3806 = null;
      }
   }

   public Object next() {
      class_59 var1 = this.field_3807;
      if(var1 == this.field_3808.field_3849) {
         var1 = null;
         this.field_3807 = null;
      } else {
         this.field_3807 = var1.field_469;
      }

      this.field_3806 = var1;
      return var1;
   }

   // $FF: renamed from: <init> (ko) void
   void method_5688(class_328 var1) {
      super();
      this.field_3806 = null;
      this.field_3808 = var1;
      this.field_3807 = this.field_3808.field_3849.field_469;
      this.field_3806 = null;
   }
}
