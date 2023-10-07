import React from 'react'
import './mai.css'
const Main = (props) => {
  console.log(props)
  return (
    <div className='main'>
      Main Component, {props.content}
    </div>
  )
}

export default Main
