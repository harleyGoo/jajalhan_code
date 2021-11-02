class BMI {
  constructor (height, weight) {
    this.height = height
    this.weight = weight
    this.bmi = this.calc()
  }
  
  calc () {
    const heightM = this.height / 100
    return this.weight / (heightM ** 2)
  }

  print () {
    let res = '보통'
    if (this.bmi >= 25) res = '비만'
    else if (this.bmi >= 18.5) res = '보통'
    else res = '마름'
    console.log('BMI=', this.bmi, res)
  }
}

const bmi = new BMI(160, 60)
bmi.print()