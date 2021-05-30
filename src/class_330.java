import java.util.Iterator;

// $FF: renamed from: kq
public class class_330 implements Iterator {

   // $FF: renamed from: n mw
   class_27 field_3853;
   // $FF: renamed from: f mw
   class_27 field_3854;
   // $FF: renamed from: v ki
   class_323 field_3855;


   // $FF: renamed from: f (ki) void
   void method_5866(class_323 var1) {
      this.field_3855 = var1;
      this.method_5868();
   }

   // $FF: renamed from: v (ki) void
   void method_5867(class_323 var1) {
      this.field_3855 = var1;
      this.method_5868();
   }

   // $FF: renamed from: n () void
   void method_5868() {
      this.field_3853 = this.field_3855 != null?this.field_3855.field_3811.field_10:null;
      this.field_3854 = null;
   }

   // $FF: renamed from: y (ki) void
   void method_5869(class_323 var1) {
      this.field_3855 = var1;
      this.method_5868();
   }

   // $FF: renamed from: <init> (ki) void
   class_330(class_323 var1) {
      super();
      this.field_3854 = null;
      this.method_5867(var1);
   }

   public void remove() {
      if(this.field_3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3854.method_108();
         this.field_3854 = null;
      }
   }

   // $FF: renamed from: r () void
   void method_5871() {
      this.field_3853 = this.field_3855 != null?this.field_3855.field_3811.field_10:null;
      this.field_3854 = null;
   }

   public boolean hasNext() {
      return this.field_3853 != this.field_3855.field_3811;
   }

   public Object next() {
      class_27 var1 = this.field_3853;
      if(var1 == this.field_3855.field_3811) {
         var1 = null;
         this.field_3853 = null;
      } else {
         this.field_3853 = var1.field_10;
      }

      this.field_3854 = var1;
      return var1;
   }

   // $FF: renamed from: j () void
   void method_5872() {
      this.field_3853 = this.field_3855 != null?this.field_3855.field_3811.field_10:null;
      this.field_3854 = null;
   }

   // $FF: renamed from: c () boolean
   public boolean method_5873() {
      return this.field_3853 != this.field_3855.field_3811;
   }

   // $FF: renamed from: b () java.lang.Object
   public Object method_5874() {
      class_27 var1 = this.field_3853;
      if(var1 == this.field_3855.field_3811) {
         var1 = null;
         this.field_3853 = null;
      } else {
         this.field_3853 = var1.field_10;
      }

      this.field_3854 = var1;
      return var1;
   }

   // $FF: renamed from: d () java.lang.Object
   public Object method_5875() {
      class_27 var1 = this.field_3853;
      if(var1 == this.field_3855.field_3811) {
         var1 = null;
         this.field_3853 = null;
      } else {
         this.field_3853 = var1.field_10;
      }

      this.field_3854 = var1;
      return var1;
   }

   // $FF: renamed from: s () java.lang.Object
   public Object method_5876() {
      class_27 var1 = this.field_3853;
      if(var1 == this.field_3855.field_3811) {
         var1 = null;
         this.field_3853 = null;
      } else {
         this.field_3853 = var1.field_10;
      }

      this.field_3854 = var1;
      return var1;
   }

   // $FF: renamed from: u () java.lang.Object
   public Object method_5877() {
      class_27 var1 = this.field_3853;
      if(var1 == this.field_3855.field_3811) {
         var1 = null;
         this.field_3853 = null;
      } else {
         this.field_3853 = var1.field_10;
      }

      this.field_3854 = var1;
      return var1;
   }

   // $FF: renamed from: l () boolean
   public boolean method_5878() {
      return this.field_3853 != this.field_3855.field_3811;
   }

   // $FF: renamed from: o () boolean
   public boolean method_5879() {
      return this.field_3853 != this.field_3855.field_3811;
   }

   // $FF: renamed from: p () void
   void method_5880() {
      this.field_3853 = this.field_3855 != null?this.field_3855.field_3811.field_10:null;
      this.field_3854 = null;
   }

   // $FF: renamed from: e () void
   public void method_5881() {
      if(this.field_3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3854.method_108();
         this.field_3854 = null;
      }
   }

   // $FF: renamed from: g () void
   public void method_5882() {
      if(this.field_3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3854.method_108();
         this.field_3854 = null;
      }
   }

   // $FF: renamed from: a () void
   public void method_5883() {
      if(this.field_3854 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3854.method_108();
         this.field_3854 = null;
      }
   }
}
