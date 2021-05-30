
// $FF: renamed from: ka
public final class class_316 {

   // $FF: renamed from: v mf
   class_59 field_3786;


   // $FF: renamed from: <init> () void
   public class_316() {
      super();
      class_59 var10001 = new class_59();
      this.field_3786 = var10001;
      this.field_3786.field_469 = this.field_3786;
      this.field_3786.field_471 = this.field_3786;
   }

    // $FF: renamed from: n (mf) void
   public void method_5610(class_59 var1) {
      if(var1.field_471 != null) {
         var1.method_635();
      }

      var1.field_471 = this.field_3786;
      var1.field_469 = this.field_3786.field_469;
      var1.field_471.field_469 = var1;
      var1.field_469.field_471 = var1;
   }

   // $FF: renamed from: v (mf) void
   public void method_5611(class_59 var1) {
      if(var1.field_471 != null) {
         var1.method_635();
      }

      var1.field_471 = this.field_3786.field_471;
      var1.field_469 = this.field_3786;
      var1.field_471.field_469 = var1;
      var1.field_469.field_471 = var1;
   }

    // $FF: renamed from: f () mf
   public class_59 method_5613() {
      class_59 var1 = this.field_3786.field_469;
      return var1 == this.field_3786?null:var1;
   }

}
