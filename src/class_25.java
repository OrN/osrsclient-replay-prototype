
// $FF: renamed from: ab
public class class_25 implements class_1 {

   // $FF: renamed from: n (nd, nd) void
   void method_87(Buffer var1, Buffer var2) {
      class_130 var10000 = new class_130(var1);
      class_130 var3 = var10000;
      class_128 var7 = new class_128();
      class_128 var4 = var7;

      long var5;
      for(var5 = 0L; !var4.method_2834(var3.method_2867(), var3.method_2866(), var5); ++var5) {
         ;
      }

      var2.method_341(var5);
   }

   // $FF: renamed from: v (nd) nd
   public Buffer method_3(Buffer var1) {
      Buffer var10000 = new Buffer(100);
      Buffer var2 = var10000;
      this.method_87(var1, var2);
      return var2;
   }

    // $FF: renamed from: <init> () void
   class_25() {
      super();
   }

}
