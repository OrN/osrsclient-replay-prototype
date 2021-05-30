import java.util.Iterator;

// $FF: renamed from: kg
public class class_321 implements Iterator {

   // $FF: renamed from: f mf
   class_59 field_3806;
   // $FF: renamed from: n mf
   class_59 field_3807;
   // $FF: renamed from: v ko
   class_328 field_3808;


    public void remove() {
      if(this.field_3806 == null) {
         throw new IllegalStateException();
      } else {
         this.field_3806.method_635();
         this.field_3806 = null;
      }
   }

    public boolean hasNext() {
      return this.field_3807 != this.field_3808.field_3849;
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
   class_321(class_328 var1) {
      super();
      this.field_3806 = null;
      this.field_3808 = var1;
      this.field_3807 = this.field_3808.field_3849.field_469;
      this.field_3806 = null;
   }
}
