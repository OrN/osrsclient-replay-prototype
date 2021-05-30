
// $FF: renamed from: km
public class class_326 {

   // $FF: renamed from: n mz
   class_354 field_3842;
   // $FF: renamed from: v mz
   class_354 field_3843;


   // $FF: renamed from: <init> () void
   public class_326() {
      super();
      class_354 var10001 = new class_354();
      this.field_3843 = var10001;
      this.field_3843.field_3964 = this.field_3843;
      this.field_3843.field_3963 = this.field_3843;
   }

   // $FF: renamed from: v (mz) void
   public void method_5784(class_354 var1) {
      if(var1.field_3963 != null) {
         var1.method_6237();
      }

      var1.field_3963 = this.field_3843.field_3963;
      var1.field_3964 = this.field_3843;
      var1.field_3963.field_3964 = var1;
      var1.field_3964.field_3963 = var1;
   }

    // $FF: renamed from: n () mz
   public class_354 method_5788() {
      class_354 var1 = this.field_3843.field_3964;
      if(var1 == this.field_3843) {
         this.field_3842 = null;
         return null;
      } else {
         this.field_3842 = var1.field_3964;
         return var1;
      }
   }

    // $FF: renamed from: f () mz
   public class_354 method_5791() {
      class_354 var1 = this.field_3842;
      if(var1 == this.field_3843) {
         this.field_3842 = null;
         return null;
      } else {
         this.field_3842 = var1.field_3964;
         return var1;
      }
   }

}
